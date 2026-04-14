package org.pmr.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDrop

{
    public static void main(String[] args) {

        // Initialize driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://demoqa.com/droppable");

        // Locate source (drag) and target (drop)
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Create Actions class
        Actions actions = new Actions(driver);

        // Perform drag and drop
        actions.dragAndDrop(source, target).perform();

        // Close browser
        // driver.quit();
    }
}
     
